package sample.MavenLibertyTest01;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest/*")
public class HelloWorldAppConfig extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(sample.MavenLibertyTest01.HelloWorldResource01.class);
    return classes;
  }
}