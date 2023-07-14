import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/helloworld")
public class Resource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getHelloWorld() {
        String message = "Hello, World!";
        return Response.ok(message).build();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response postHelloWorld(
            @QueryParam("name") String name,
            @QueryParam("age") int age,
            @QueryParam("salary") double salary,
            @QueryParam("ID") int ID
    ) {
        Employee employee = new Employee(name, ID, age, salary);

        String message = "Name: " + employee.getName() + "\tID: " + employee.getID() + "\tAge: " + employee.getAge() + "\tSalary: " + employee.getSalary() + "\n";
        return Response.status(Response.Status.CREATED).entity(message).build();
    }
}