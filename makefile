all:
	del *.java
	del *.class
	javacc main.jj
	javac *.java
	cls
	java FreePascal input.pas
	del *.java
	del *.class
clean:
	del *.java
	del *.class