import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;
@Path("/helloworld")
public class Resource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees = EmployeeFunctions.getAllEmployees();
        String message = "";
        for (Employee employee : employees) {
            message += "Name: " + employee.getName() + "\tID: " + employee.getID() + "\tAge: " + employee.getAge() + "\tSalary: " + employee.getSalary() + "\n";
        }
        return Response.ok(message).build();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getEmployeeByID() {
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
        EmployeeFunctions.addEmployee(employee);
        String message = "Name: " + employee.getName() + "\tID: " + employee.getID() + "\tAge: " + employee.getAge() + "\tSalary: " + employee.getSalary() + "\n";
        return Response.status(Response.Status.CREATED).entity(message).build();
    }
}