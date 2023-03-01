all:
	del *.java
	del *.class
	javacc main.jj
	javac *.java
	cls
	java FreePascal teste2.pas
	del *.java
	del *.class
clean:
	del *.java
	del *.class