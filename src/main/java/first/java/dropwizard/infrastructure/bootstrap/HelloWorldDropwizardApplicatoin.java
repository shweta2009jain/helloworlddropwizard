package first.java.dropwizard.infrastructure.bootstrap;

import first.java.dropwizard.port.rest.family.FamilyResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldDropwizardApplicatoin extends Application<HelloWorldDropwizardConfiguration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldDropwizardApplicatoin.class);

    public static void main(String[] args) throws Exception {
        new HelloWorldDropwizardApplicatoin().run(args);
    }

    @Override
    public String getName() {
        return "hello-world-dropwizard";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldDropwizardConfiguration> bootstrap) {
        // nothing to do yet
        LOGGER.info("Java version: [{}]", System.getProperty("java.version"));
//        ObjectMapper objectMapper = ObjectMapperFactory.create();
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//
//        bootstrap.setObjectMapper(objectMapper);
//        bootstrap.addBundle(new DBMigrationBundle());
//        bootstrap.setConfigurationSourceProvider(
//                new SubstitutingSourceProvider(
//                        bootstrap.getConfigurationSourceProvider(),
//                        new EnvironmentVariableSubstitutor()
//                )
//        );
//        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(HelloWorldDropwizardConfiguration configuration, Environment environment) {
        // nothing to do yet

        environment.jersey().register(new FamilyResource());
    }
}
