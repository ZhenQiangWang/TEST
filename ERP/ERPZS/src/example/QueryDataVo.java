package example;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class QueryDataVo {

    private ResponseDTO response;

    @NoArgsConstructor
    @Data
    public static class ResponseDTO {
        private ExecutionDTO execution;
        private ResponseContentDTO responseContent;

        @NoArgsConstructor
        @Data
        public static class ExecutionDTO {
            private StatusDTO status;

            @NoArgsConstructor
            @Data
            public static class StatusDTO {
                private int sqlcode;
                private String description;
                private int code;
            }
        }

        @NoArgsConstructor
        @Data
        public static class ResponseContentDTO {
            private DocumentDTO document;
            private String parameter;

            @NoArgsConstructor
            @Data
            public static class DocumentDTO {
                private RecordSetDTO recordSet;

                @NoArgsConstructor
                @Data
                public static class RecordSetDTO {
                    private int id;
                    private MasterDTO master;

                    @NoArgsConstructor
                    @Data
                    public static class MasterDTO {
                        private List<FieldDTO> field;
                        private List<String> record;
                        private String name;

                        @NoArgsConstructor
                        @Data
                        public static class FieldDTO {
                            private String name;
                            private String value;
                        }
                    }
                }
            }
        }
    }
}
