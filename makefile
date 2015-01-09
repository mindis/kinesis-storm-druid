DIRS := models
OBJS := $(foreach dir,$(DIRS),$(wildcard $(dir)/*.o))

all: 
	./compileModels.sh 
