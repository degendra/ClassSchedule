package np.pro.degendra.classschedule.restClient;

import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.RestClientErrorHandling;
import org.springframework.http.client.OkHttpClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

/**
 * Created by degendra on 05/31/15.
 */
@Rest(rootUrl = "http://localhost:8080", converters = {MappingJacksonHttpMessageConverter.class}, requestFactory = OkHttpClientHttpRequestFactory.class)
public interface ClassScheduleClient extends RestClientErrorHandling {

    /**
     * getter setter functions
     */
    void setCookie(String name, String value);

    String getCookie(String name);

    void setHeader(String name, String value);

    String getHeader(String name);

}
