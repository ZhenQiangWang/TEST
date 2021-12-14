package example;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <Response>
 *   <Execution>
 *     <Status code="-1" sqlcode="0" description="料号sy211130wzq 料号不存在，请检查！"/>
 *   </Execution>
 *   <ResponseContent>
 *     <Parameter/>
 *     <Document/>
 *   </ResponseContent>
 * </Response>
 */

@NoArgsConstructor
@Data
public class TipTopResultVO {

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
         * execution
         */
        private ExecutionDTO execution;
        /**
         * responseContent
         */
        private ResponseContentDTO responseContent;

        /**
         * ExecutionDTO
         */
        @NoArgsConstructor
        @Data
        public static class ExecutionDTO {
            /**
             * status
             */
            private StatusDTO status;

            /**
             * StatusDTO
             */
            @NoArgsConstructor
            @Data
            public static class StatusDTO {
                /**
                 * sqlcode
                 */
                private int sqlcode;
                /**
                 * description
                 */
                private String description;
                /**
                 * code
                 */
                private int code;
            }
        }

        /**
         * ResponseContentDTO
         */
        @NoArgsConstructor
        @Data
        public static class ResponseContentDTO {
            /**
             * 问题描述
             */
            private String document;
            /**
             * parameter
             */
            private String parameter;
        }
    }
}
