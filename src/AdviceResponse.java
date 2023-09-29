import com.google.gson.annotations.SerializedName;

public class AdviceResponse {
    @SerializedName("slip")
    private Slip slip;

    public Slip getSlip() {
        return slip;
    }
}
