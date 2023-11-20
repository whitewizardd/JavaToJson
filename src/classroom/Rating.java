package classroom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {
    @JsonProperty("rate")
    private double rate;
    @JsonProperty("count")
    private int count;
}
