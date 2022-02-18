//package example.Bean;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@NoArgsConstructor
//@Data
///**
// * 报工
// */
//public class SubmitToTipTopVO {
//
//    /**
//     * request
//     */
//    private RequestDTO request;
//
//    /**
//     * RequestDTO
//     */
//    @NoArgsConstructor
//    @Data
//    public static class RequestDTO {
//        /**
//         * requestContent
//         */
//        private RequestContentDTO requestContent;
//        /**
//         * access
//         */
//        private AccessDTO access;
//
//        /**
//         * RequestContentDTO
//         */
//        @NoArgsConstructor
//        @Data
//        public static class RequestContentDTO {
//            /**
//             * parameter
//             */
//            private ParameterDTO parameter;
//
//            /**
//             * ParameterDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class ParameterDTO {
//                /**
//                 * record
//                 */
//                private RecordDTO record;
//
//                /**
//                 * RecordDTO
//                 */
//                @NoArgsConstructor
//                @Data
//                public static class RecordDTO {
//                    /**
//                     * document
//                     */
//                    private DocumentDTO document;
//
//                    /**
//                     * DocumentDTO
//                     */
//                    @NoArgsConstructor
//                    @Data
//                    public static class DocumentDTO {
//                        /**
//                         * recordSet
//                         */
//                        private RecordSetDTO recordSet;
//
//                        /**
//                         * RecordSetDTO
//                         */
//                        @NoArgsConstructor
//                        @Data
//                        public static class RecordSetDTO {
//                            /**
//                             * id
//                             */
//                            private int id;
//                            /**
//                             * detail
//                             */
//                            private DetailDTO detail;
//                            /**
//                             * master
//                             */
//                            private MasterDTO master;
//
//                            /**
//                             * DetailDTO
//                             */
//                            @NoArgsConstructor
//                            @Data
//                            public static class DetailDTO {
//                                /**
//                                 * record
//                                 */
//                                private List<RecordDTOs> record;
//                                /**
//                                 * name
//                                 */
//                                private String name;
//
//                                /**
//                                 * RecordDTO
//                                 */
//                                @NoArgsConstructor
//                                @Data
//                                public static class RecordDTOs {
//                                    /**
//                                     * field
//                                     */
//                                    private List<FieldDTO> field;
//
//                                    /**
//                                     * FieldDTO
//                                     */
//                                    @NoArgsConstructor
//                                    @Data
//                                    public static class FieldDTO {
//                                        /**
//                                         * name
//                                         */
//                                        private String name;
//                                        /**
//                                         * value
//                                         */
//                                        private String value;
//                                    }
//                                }
//                            }
//
//                            /**
//                             * MasterDTO
//                             */
//                            @NoArgsConstructor
//                            @Data
//                            public static class MasterDTO {
//                                /**
//                                 * record
//                                 */
//                                private masterRecordDTO record;
//                                /**
//                                 * name
//                                 */
//                                private String name;
//
//                                /**
//                                 * RecordDTO
//                                 */
//                                @NoArgsConstructor
//                                @Data
//                                public static class masterRecordDTO {
//                                    /**
//                                     * field
//                                     */
//                                    private List<FieldDTO> field;
//
//                                    /**
//                                     * FieldDTO
//                                     */
//                                    @NoArgsConstructor
//                                    @Data
//                                    public static class FieldDTO {
//                                        /**
//                                         * name
//                                         */
//                                        private String name;
//                                        /**
//                                         * value
//                                         */
//                                        private String value;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        /**
//         * AccessDTO
//         */
//        @NoArgsConstructor
//        @Data
//        public static class AccessDTO {
//            /**
//             * organization
//             */
//            private OrganizationDTO organization;
//            /**
//             * locale
//             */
//            private LocaleDTO locale;
//            /**
//             * appdevice
//             */
//            private AppdeviceDTO appdevice;
//            /**
//             * connection
//             */
//            private ConnectionDTO connection;
//            /**
//             * authentication
//             */
//            private AuthenticationDTO authentication;
//
//            /**
//             * OrganizationDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class OrganizationDTO {
//                /**
//                 * name
//                 */
//                private String name;
//            }
//
//            /**
//             * LocaleDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class LocaleDTO {
//                /**
//                 * language
//                 */
//                private String language;
//            }
//
//            /**
//             * AppdeviceDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class AppdeviceDTO {
//                /**
//                 * timestamp
//                 */
//                private String timestamp;
//                /**
//                 * appid
//                 */
//                private String appid;
//                /**
//                 * appmodule
//                 */
//                private String appmodule;
//            }
//
//            /**
//             * ConnectionDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class ConnectionDTO {
//                /**
//                 * application
//                 */
//                private String application;
//                /**
//                 * source
//                 */
//                private int source;
//            }
//
//            /**
//             * AuthenticationDTO
//             */
//            @NoArgsConstructor
//            @Data
//            public static class AuthenticationDTO {
//                /**
//                 * user
//                 */
//                private String user;
//                /**
//                 * password
//                 */
//                private String password;
//            }
//        }
//    }
//}
