package io.swagger.api;

import io.swagger.model.InlineResponse500;
import io.swagger.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-25T19:25:07.803Z[GMT]")
@Controller
public class ProductApiController implements ProductApi {

    private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Product>> productGet(@ApiParam(value = "Page number to return") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @Max(100) @ApiParam(value = "Number of results in the page", allowableValues = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> productPost(@ApiParam(value = ""  )  @Valid @RequestBody Product body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> productProductIdGet(@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId,@ApiParam(value = "" ) @RequestHeader(value="customer-security-header", required=false) Integer customerSecurityHeader) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED);
    }

}
