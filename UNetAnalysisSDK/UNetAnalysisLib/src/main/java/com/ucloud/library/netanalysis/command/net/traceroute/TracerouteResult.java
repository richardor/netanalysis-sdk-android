package com.ucloud.library.netanalysis.command.net.traceroute;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 2018/9/6 16:22.
 * Company: UCloud
 * E-mail: joshua.yin@ucloud.cn
 */
public class TracerouteResult {
    @SerializedName("targetIp")
    private String targetIp;
    @SerializedName("tracerouteNodeResults")
    private List<TracerouteNodeResult> tracerouteNodeResults;
    
    public TracerouteResult(String targetIp) {
        this.targetIp = targetIp;
        tracerouteNodeResults = new ArrayList<>();
    }
    
    public String getTargetIp() {
        return targetIp;
    }
    
    public List<TracerouteNodeResult> getTracerouteNodeResults() {
        return tracerouteNodeResults;
    }
    
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
