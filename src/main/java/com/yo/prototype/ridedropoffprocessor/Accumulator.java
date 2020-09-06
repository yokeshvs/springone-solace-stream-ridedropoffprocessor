package com.yo.prototype.ridedropoffprocessor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accumulator {
    private int rideCount;
    private double totalMeter;
    private int totalPassengers;
}
