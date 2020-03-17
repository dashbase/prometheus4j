package com.github.anhdat.models;

import java.util.List;
import java.util.Map;

public class VectorResponse {
    public String status() {
        return this.status;
    }

    public VectorResponse status(String status) {
        this.status = status;
        return this;
    }

    public VectorData data() {
        return this.data;
    }

    public VectorResponse data(VectorData data) {
        this.data = data;
        return this;
    }

    public String status;
    public VectorData data;

    public class VectorResult {
        public Map<String, String> metric() {
            return this.metric;
        }

        public VectorResult metric(Map<String, String> metric) {
            this.metric = metric;
            return this;
        }

        public List<Double> value() {
            return this.value;
        }

        public VectorResult value(List<Double> value) {
            this.value = value;
            return this;
        }

        public Map<String, String> metric;
        public List<Double> value;

        @Override
        public String toString() {
            return String.format(
                "metric: %s\nvalue: %s",
                metric.toString(),
                value == null ? "" : value.toString()
            );
        }
    }

    public class VectorData {
        public String resultType() {
            return this.resultType;
        }

        public VectorData resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        public List<VectorResult> result() {
            return this.result;
        }

        public VectorData result(List<VectorResult> result) {
            this.result = result;
            return this;
        }

        public String resultType;
        public List<VectorResult> result;
    }
}
