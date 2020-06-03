package gk.test;

import gk.enable.EnableHelloWorld;
import gk.manualassembly.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableRepo
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RepoConfiguration repoConfiguration = context.getBean("RepoConfiguration", RepoConfiguration.class);

        System.out.println(repoConfiguration);

        context.close();
    }
}
