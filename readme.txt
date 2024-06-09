LLRP (ltkjava) fork with fixes.
Forked from https://sourceforge.net/projects/llrp-toolkit/

NOTE : There seems to be deadlock issues with mina 2.x, therefore use the org branch that uses mina 1.x

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
 -0.3 : upgrade to slf/2.x and fix connection issues

Notes:
  - JavaForce is only used for build scripts to download dependancies and build deployment artifacts
