package fixtures.sample;

import javax.ws.rs.*;

public class SubResource {
    /**
     * some value
     */
    private String value;
    
    @GET
    @Path("annotated")
    public String sayHello(@QueryParam("name") @DefaultValue("World") String name) {
        return "Hello, " + name + "!";
    }

    @POST
    public int createSub() {
        return 0;
    }

    public String getValue()  {
        return value;
    }
    
    /**
     * this method returns a copy of <code>value</code>
     * 
     *  @return copy of a value
     */
    public String getValueThroughAnotherMethod()  {
        return value;
    }
}
