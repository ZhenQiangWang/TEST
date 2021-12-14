package example;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ResultVO {

    /**
     * response
     */
    private ResponseDTO response;

    /**
     * ResponseDTO
     */
    @NoArgsConstructor
    @Data
    public static class ResponseDTO {
        /**
         * message
         */
        private String message;
        /**
         * result
         */
        private String result;
        /**
         * identity
         */
        private IdentityDTO identity;
        /**
         * returnvalue
         */
        private String returnvalue;
        /**
         * exception
         */
        private ExceptionDTO exception;

        /**
         * IdentityDTO
         */
        @NoArgsConstructor
        @Data
        public static class IdentityDTO {
            /**
             * transactionid
             */
            private long transactionid;
            /**
             * functionid
             */
            private String functionid;
            /**
             * moduleid
             */
            private String moduleid;
            /**
             * computername
             */
            private String computername;
            /**
             * sendtime
             */
            private String sendtime;
            /**
             * curuserno
             */
            private String curuserno;
        }

        /**
         * ExceptionDTO
         */
        @NoArgsConstructor
        @Data
        public static class ExceptionDTO {
            /**
             * sysmsg
             */
            private String sysmsg;
            /**
             * mesmsg
             */
            private String mesmsg;
            /**
             * code
             */
            private String code;
            /**
             * stack
             */
            private String stack;
        }
    }
}
