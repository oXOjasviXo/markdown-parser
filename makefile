CLASSPATH=".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar"

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
MarkdownParseWeek7.class: MarkdownParseWeek7.java
	javac MarkdownParseWeek7.java
MarkDownParseTest.class: MarkdownParse.class MarkdownParseWeek7.class MarkDownParseTest.java
	javac -cp $(CLASSPATH) MarkDownParseTest.java
run: MarkdownParse.class MarkdownParseWeek7.class MarkDownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkDownParseTest