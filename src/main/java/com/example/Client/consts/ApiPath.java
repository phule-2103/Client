package com.example.Client.consts;

public interface ApiPath {
    String API = "/api/v1";
    /*String API = "http://localhost:8080/api/v1";*/

    // Tour
    String TOUR_CREATE  = API + "/tour/create";
    String TOUR_FIND_ALL = API + "/tour/find-all";
    String  TOUR_FIND_BY_ID = API +  "/tour/find-by-id";
    String TOUR_UPDATE = API +  "/tour/update";
    String TOUR_DELETE = API +  "/tour/delete";

    // Tour Detail
    String TOUR_DETAIL_CREATE = API + "/tour-detail/create";
    String TOUR_DETAIL_FIND_ALL = API + "/tour-detail/find-all";

    /*String TOUR_DETAIL_FIND_BY_ID = API + "/tour-detail/find-by-id";*/
    String HOME_TOUR_DETAIL = "/tour/home-tour-detail";
    String TOUR_DETAIL_UPDATE = API + "/tour-detail/update";
    String TOUR_DETAIL_DELETE = API + "/tour-detail/delete";

    // Cart
    String CART_CREATE = API + "/cart/create";
    String CART_FIND_ALL= API + "/cart/find-all";
    String CART_FIND_BY_ID = API + "/cart/find-by-id";
    String CART_UPDATE = API + "/cart/update";
    String CART_DELETE = API + "/cart/delete";

}
