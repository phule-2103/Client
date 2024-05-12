package com.example.Client.consts;

public interface ApiPath {
    String API = "/api/v1";

    // Tour
    String TOUR_CREATE  = "/tour/create";
    String TOUR_FIND_ALL = "/tour/find-all";
    String  TOUR_FIND_BY_ID = "/tour/find-by-id";
    String TOUR_UPDATE = "/tour/update";
    String TOUR_DELETE = "/tour/delete";

    // Tour Detail
    String TOUR_DETAIL_CREATE = API + "/tour-detail/create";
    String TOUR_DETAIL_FIND_ALL = API + "/tour-detail/find-all";
    String TOUR_DETAIL_FIND_BY_ID = API + "/tour-detail/find-by-id";
    String TOUR_DETAIL_UPDATE = API + "/tour-detail/update";
    String TOUR_DETAIL_DELETE = API + "/tour-detail/delete";


    //cart
    String CART_CREATE = API + "/cart/create";
    String CART_FIND_ALL= API + "/cart/find_all";
    String CART_FIND_BY_ID = API + "/cart/find-by-id";
    String CART_UPDATE = API + "/cart/update";
    String CART_DELETE = API + "/cart/delete";



}
