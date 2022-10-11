package client;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class RoleDTO {

    /**
     * parentMenuRrn
     */
    private int parentMenuRrn;
    /**
     * parentMenuId
     */
    private Object parentMenuId;
    /**
     * text
     */
    private String text;
    /**
     * torrn
     */
    private String torrn;
    /**
     * fromrrn
     */
    private String fromrrn;
    /**
     * program
     */
    private Object program;
    /**
     * nameSpace
     */
    private String nameSpace;
    /**
     * instanceId
     */
    private String instanceId;
    /**
     * children
     */
    private List<GNK> gnk;
    /**
     * checked
     */
    private boolean checked;
    /**
     * objectType
     */
    private String objectType;
    /**
     * labelId
     */
    private String labelId;

    /**
     * ChildrenRoleDTO
     */
    @NoArgsConstructor
    @Data
    public static class GNK {
        /**
         * parentMenuRrn
         */
        private int parentMenuRrn;
        /**
         * parentMenuId
         */
        private String parentMenuId;
        /**
         * text
         */
        private String text;
        /**
         * torrn
         */
        private String torrn;
        /**
         * fromrrn
         */
        private String fromrrn;
        /**
         * program
         */
        private Object program;
        /**
         * nameSpace
         */
        private String nameSpace;
        /**
         * instanceId
         */
        private String instanceId;
        /**
         * children
         */
        private List<GNX> gnx;
        /**
         * checked
         */
        private boolean checked;
        /**
         * objectType
         */
        private String objectType;
        /**
         * labelId
         */
        private String labelId;

        /**
         * ChildrenRoleDTO
         */
        @NoArgsConstructor
        @Data
        public static class GNX {
            /**
             * parentMenuRrn
             */
            private int parentMenuRrn;
            /**
             * parentMenuId
             */
            private String parentMenuId;
            /**
             * text
             */
            private String text;
            /**
             * torrn
             */
            private String torrn;
            /**
             * fromrrn
             */
            private String fromrrn;
            /**
             * program
             */
            private String program;
            /**
             * nameSpace
             */
            private String nameSpace;
            /**
             * instanceId
             */
            private String instanceId;
            /**
             * children
             */
            private List<XX> children;
            /**
             * checked
             */
            private boolean checked;
            /**
             * objectType
             */
            private String objectType;
            /**
             * labelId
             */
            private String labelId;
            /**
             * leaf
             */
            private boolean leaf;

            /**
             * ChildrenRoleDTO
             */
            @NoArgsConstructor
            @Data
            public static class XX {
                /**
                 * text
                 */
                private String text;
                /**
                 * torrn
                 */
                private String torrn;
                /**
                 * fromrrn
                 */
                private String fromrrn;
                /**
                 * nameSpace
                 */
                private String nameSpace;
                /**
                 * instanceId
                 */
                private String instanceId;
                /**
                 * leaf
                 */
                private boolean leaf;
                /**
                 * checked
                 */
                private boolean checked;
                /**
                 * objectType
                 */
                private String objectType;
                /**
                 * labelId
                 */
                private String labelId;
            }
        }
    }
}
