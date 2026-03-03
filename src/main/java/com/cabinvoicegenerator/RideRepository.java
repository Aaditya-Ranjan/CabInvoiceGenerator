package com.cabinvoicegenerator;

public interface RideRepository {
    Ride[] getRides(String userId);
}