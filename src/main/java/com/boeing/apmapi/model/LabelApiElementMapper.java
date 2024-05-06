package com.boeing.apmapi.model;

public class LabelApiElementMapper {

    public static String getApiElementLabel(ApiElementEnum apiElement) {
        
        switch (apiElement) {
 
            default:
                return null;
        }
    }

    public static ApiElementEnum getApiElementEnum(String label) {
        switch (label) {
            case "CVV":
                return ApiElementEnum.CVV;
            case "EVV":
                return ApiElementEnum.EVV;
            case "FNA":
                return ApiElementEnum.FNA;
            case "FNC":
                return ApiElementEnum.FNC;
            case "FNG":
                return ApiElementEnum.FNG;
            case "Graph":
                return ApiElementEnum.Graph;
            case "NTT":
                return ApiElementEnum.NTT;
            case "TKK":
                return ApiElementEnum.TKK;
            case "ApmFnaNode":
                return ApiElementEnum.ApmFnaNode;
            case "ApmFncNode":
                return ApiElementEnum.ApmFncNode;
            case "ApmFngNode":
                return ApiElementEnum.ApmFngNode;
            case "ApmNote":
                return
}
