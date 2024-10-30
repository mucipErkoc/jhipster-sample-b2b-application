package com.essentra;

import com.essentra.config.AsyncSyncConfiguration;
import com.essentra.config.EmbeddedElasticsearch;
import com.essentra.config.EmbeddedKafka;
import com.essentra.config.EmbeddedSQL;
import com.essentra.config.JacksonConfiguration;
import com.essentra.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JhipsterSampleB2BApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class,
    }
)
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
