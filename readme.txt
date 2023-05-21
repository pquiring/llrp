LLRP (ltkjava) fork with fixes.
Forked from https://sourceforge.net/projects/llrp-toolkit/

Building:
  - check out javaforce
    git clone http://github.com/pquiring/javaforce
    cd javaforce
  - check out llrp
    cd lib
    git clone http://github.com/pquiring/llrp
  - build it
    cd llrp
    ant

Major changes:
 -0.1 : upgraded to mina 2.x
 -0.2 : replaced minx 2.x deprecated methods

Notes:
  - JavaForce is only used for build scripts to download dependancies and build deployment artifacts
