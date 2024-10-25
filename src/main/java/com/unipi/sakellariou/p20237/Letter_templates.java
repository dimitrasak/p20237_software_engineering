package com.unipi.sakellariou.p20237;

public class Letter_templates {

        private int template_id;
        private String template_name;
        private String content;

        public Letter_templates(int templateId, String templateName, String content) {
            this.template_id = templateId;
            this.template_name = templateName;
            this.content = content;
        }


        public int getTemplate_id() {
            return template_id;
        }

        public void setTemplate_id(int template_id) {
            this.template_id = template_id;
        }

        public String getTemplate_name() {
            return template_name;
        }

        public void setTemplate_name(String template_name) {
            this.template_name = template_name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
}


