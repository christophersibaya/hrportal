package com.sars.hrportal.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sars.hrportal.Dto.EmployeeDto;
import com.sars.hrportal.common.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Value("${hrsystem.baseUrl}")
    private String hrSystemBaseUrl;

    private ObjectMapper jsonMapper;

    public EmployeeServiceImpl(ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
        jsonMapper = new ObjectMapper();

        jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        jsonMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> retValue = new ArrayList<>();
        String responseBody = null;

        try {
            RestTemplate restTemplate = new RestTemplate();

            final String url = hrSystemBaseUrl + "/all";
            URI uri = new URI(url);

            ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

            responseBody = result.getBody();

            retValue = Arrays.asList(jsonMapper.readValue(responseBody, EmployeeDto[].class));

        } catch (Exception e) {
            //TODO handle error
        }

        return retValue;
    }

    @Override
    public String saveEmployee(String employeeDtoJson) {
        EmployeeDto retValue = new EmployeeDto();
        String responseBody = null;

        RestTemplate restTemplate = new RestTemplate();

        final String url = hrSystemBaseUrl + "/add";

        HttpHeaders httpHeaders = createHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(employeeDtoJson, httpHeaders);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);

        responseBody = response.getBody();

        //retValue = jsonMapper.readValue(responseBody, EmployeeDto.class);

        return responseBody;
    }

    @Override
    public String saveUpdatedEmployee(String employeeDtoJson) {
        EmployeeDto retValue = new EmployeeDto();
        String responseBody = null;

        RestTemplate restTemplate = new RestTemplate();

        final String url = hrSystemBaseUrl + "/update";

        HttpHeaders httpHeaders = createHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(employeeDtoJson, httpHeaders);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, httpEntity, String.class);

        responseBody = response.getBody();

        //retValue = jsonMapper.readValue(responseBody, EmployeeDto.class);

        return responseBody;
    }

    @Override
    public String deleteEmployee(long id) {
        EmployeeDto retValue = new EmployeeDto();
        String responseBody = null;

        RestTemplate restTemplate = new RestTemplate();

        final String url = hrSystemBaseUrl + "/delete/"+id;

        HttpHeaders httpHeaders = createHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(null, httpHeaders);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE, httpEntity, String.class);

        responseBody = response.getBody();

        //retValue = jsonMapper.readValue(responseBody, EmployeeDto.class);

        return responseBody;
    }

    @Override
    public EmployeeDto findEmployeeById(long id) {
        EmployeeDto retValue = new EmployeeDto();
        String responseBody = null;

        try {
            RestTemplate restTemplate = new RestTemplate();

            final String url = hrSystemBaseUrl + "/find/" + id;

            HttpHeaders httpHeaders = createHeaders();
            HttpEntity<String> httpEntity = new HttpEntity<>(null, httpHeaders);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);

            responseBody = response.getBody();

            retValue = jsonMapper.readValue(responseBody, EmployeeDto.class);

        }catch (Exception e){
            //TODO handle error
        }

        return retValue;
    }

    private HttpHeaders createHeaders() {
        return new HttpHeaders() {
            {
                setCacheControl(CacheControl.noCache().getHeaderValue());
                setContentType(MediaType.APPLICATION_JSON);
                set("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
            }
        };
    }


}
