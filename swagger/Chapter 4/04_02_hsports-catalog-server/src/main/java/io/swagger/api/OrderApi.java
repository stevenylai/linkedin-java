/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-25T19:25:07.803Z[GMT]")
@Api(value = "order", description = "the order API")
public interface OrderApi {

    @ApiOperation(value = "", nickname = "orderPost", notes = "", response = Order.class, authorizations = {
        @Authorization(value = "password", scopes = {
            @AuthorizationScope(scope = "", description = "")            })    }, tags={ "order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This is a successful response", response = Order.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Order> orderPost(@ApiParam(value = ""  )  @Valid @RequestBody Order body);

}
