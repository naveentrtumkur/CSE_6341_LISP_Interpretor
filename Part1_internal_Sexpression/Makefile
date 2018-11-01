COMPILE = javac -g

#List of class files that should be generated.
CLASS_FILES = Constants.class StringToken.class SExpr.class LispParser.class LispInterpretor.class

all: $(CLASS_FILES)

%.class : %.java
	$(COMPILE) $<

clean:
	rm *.class
