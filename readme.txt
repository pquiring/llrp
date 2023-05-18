LLRP (ltkjava) fork with fixes.
Forked from https://sourceforge.net/projects/llrp-toolkit/

Building:
  - check out javaforce
    git clone http://github.com/pquiring/javaforce
  - create lib folder
    cd javaforce
    md lib
    cd lib
  - check out llrp
    git clone http://github.com/pquiring/llrp
  - build it
    cd llrp
    ant

Major changes:
 -0.1 : upgraded to mina 2.x

Notes:
  - JavaForce is only used for build scripts to download dependancies and build deployment artifacts
