package com.github.anhdat.models;

import java.util.List;
import java.util.Map;

public class MatrixResponse {
    public String status;
    public MatrixData data;

    public String status() {
        return this.status;
    }

    public MatrixResponse status(String status) {
        this.status = status;
        return this;
    }

    public MatrixData data() {
        return this.data;
    }

    public MatrixResponse data(MatrixData data) {
        this.data = data;
        return this;
    }

    public class MatrixData {
        public String resultType() {
            return this.resultType;
        }

        public MatrixData resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        public List<MatrixResult> result() {
            return this.result;
        }

        public MatrixData result(List<MatrixResult> result) {
            this.result = result;
            return this;
        }

        public String resultType;
        public List<MatrixResult> result;
    }

    public class MatrixResult {
        public Map<String, String> metric() {
            return this.metric;
        }

        public MatrixResult metric(Map<String, String> metric) {
            this.metric = metric;
            return this;
        }

        public List<List<Double>> values() {
            return this.values;
        }

        public MatrixResult values(List<List<Double>> values) {
            this.values = values;
            return this;
        }

        public Map<String, String> metric;
        public List<List<Double>> values;

        @Override
        public String toString() {
            return String.format(
                "metric: %s\nvalues: %s",
                metric.toString(),
                values == null ? "" : values.toString()
            );
        }
    }
}
