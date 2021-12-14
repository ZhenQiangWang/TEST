package example.Bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
/**
 * 报工
 */
public class TipTopSubmitConsumeVO {


    /**
     * request
     */
    private RequestDTO request;

    /**
     * RequestDTO
     */
    @Data
    public static class RequestDTO {

        public RequestDTO() {
            this.access = new AccessDTO();
        }

        /**
         * requestContent
         */
        private RequestContentDTO requestContent;
        /**
         * access
         */
        private AccessDTO access;

        /**
         * RequestContentDTO
         */
        @Data
        public static class RequestContentDTO {

            /**
             * parameter
             */
            private ParameterDTO parameter;

            /**
             * ParameterDTO
             */
            @Data
            public static class ParameterDTO {
                /**
                 * record
                 */
                private RecordDTO record;

                /**
                 * RecordDTO
                 */
                @Data
                public static class RecordDTO {

                    /**
                     * document
                     */
                    private DocumentDTO document;

                    /**
                     * DocumentDTO
                     */
                    @Data
                    public static class DocumentDTO {

                        /**
                         * recordSet
                         */
                        private RecordSetDTO recordSet;

                        /**
                         * RecordSetDTO
                         */
                        @Data
                        public static class RecordSetDTO {

                            /**
                             * id
                             */
                            private int id;
                            /**
                             * detail
                             */
                            private DetailDTO detail;
                            /**
                             * master
                             */
                            private MasterDTO master;

                            /**
                             * DetailDTO
                             */
                            @NoArgsConstructor
                            @Data
                            public static class DetailDTO {
                                /**
                                 * record
                                 */
                                private List<RecordDTOs> record;
                                /**
                                 * name
                                 */
                                private String name;

                                /**
                                 * RecordDTO
                                 */
                                @NoArgsConstructor
                                @Data
                                public static class RecordDTOs {
                                    /**
                                     * field
                                     */
                                    private List<FieldDTO> field;

                                    /**
                                     * FieldDTO
                                     */
                                    @NoArgsConstructor
                                    @Data
                                    public static class FieldDTO {
                                        /**
                                         * name
                                         */
                                        private String name;
                                        /**
                                         * value
                                         */
                                        private String value;
                                    }
                                }
                            }

                            /**
                             * MasterDTO
                             */
                            @Data
                            public static class MasterDTO {

                                /**
                                 * record
                                 */
                                private masterRecordDTO record;
                                /**
                                 * name
                                 */
                                private String name;

                                /**
                                 * RecordDTO
                                 */
                                @Data
                                public static class masterRecordDTO {

                                    /**
                                     * field
                                     */
                                    private List<FieldDTO> field;

                                    /**
                                     * FieldDTO
                                     */
                                    @NoArgsConstructor
                                    @Data
                                    public static class FieldDTO {

                                        /**
                                         * name
                                         */
                                        private String name;
                                        /**
                                         * value
                                         */
                                        private String value;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /**
         * AccessDTO
         */
        @Data
        public static class AccessDTO {

            public AccessDTO() {
                AuthenticationDTO authenticationDTO = new AuthenticationDTO();
                OrganizationDTO organizationDTO = new OrganizationDTO();
                LocaleDTO localeDTO = new LocaleDTO();
                ConnectionDTO connectionDTO = new ConnectionDTO();
                this.authentication = authenticationDTO;
                this.organization = organizationDTO;
                this.locale = localeDTO;
                this.connection = connectionDTO;
            }

            /**
             * organization
             */
            private OrganizationDTO organization;
            /**
             * locale
             */
            private LocaleDTO locale;
            /**
             * appdevice
             */
            private AppdeviceDTO appdevice;
            /**
             * connection
             */
            private ConnectionDTO connection;
            /**
             * authentication
             */
            private AuthenticationDTO authentication;

            /**
             * OrganizationDTO
             */
            @Data
            public static class OrganizationDTO {
                public OrganizationDTO() {
                    this.name = "营运中心";
                }

                /**
                 * name
                 */
                private String name;
            }

            /**
             * LocaleDTO
             */
            @Data
            public static class LocaleDTO {

                public LocaleDTO() {
                    this.language = "zh_CN";
                }

                /**
                 * language
                 */
                private String language;
            }

            /**
             * AppdeviceDTO
             */
            @NoArgsConstructor
            @Data
            public static class AppdeviceDTO {
                /**
                 * timestamp
                 */
                private String timestamp;
                /**
                 * appid
                 */
                private String appid;
                /**
                 * appmodule
                 */
                private String appmodule;
            }

            /**
             * ConnectionDTO
             */
            @Data
            public static class ConnectionDTO {

                public ConnectionDTO() {
                    this.application = "application";
                    this.source = "source";
                }

                /**
                 * application
                 */
                private String application;
                /**
                 * source
                 */
                private String source;
            }

            /**
             * AuthenticationDTO
             */
            @Data
            public static class AuthenticationDTO {

                public AuthenticationDTO() {
                    this.user = "tiptop";
                    this.password = "tiptop";
                }

                /**
                 * user
                 */
                private String user;
                /**
                 * password
                 */
                private String password;
            }
        }
    }
}
