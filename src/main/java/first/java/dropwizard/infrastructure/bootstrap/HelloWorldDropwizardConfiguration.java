package first.java.dropwizard.infrastructure.bootstrap;

import io.dropwizard.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class HelloWorldDropwizardConfiguration extends Configuration {


    public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
        return new AppConfigurationEntry[0];
    }
}
