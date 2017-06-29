# Gatling-POA

This is a respository of all necessary files and artifacts to run end-to-end POA load tests through Gatling for Verizon and Sprint. (Sprint does not complete activation due to an error in the application. This will be corrected as soon as possible.)

##Setup

###Cloning this project
Please clone this repository into the projects/ directory under your home directory, which is a part of the standard setup for Docker containers at Consensus.

###Directory structure
The project is modeled after the Gatling user-files directory setup, which contains three top level directories. 
- results/, a place where test results live locally. The files inside the results directory (as well as the gatling.log) are meant for local setup. They are not meant to be checked into github. There is a .gitignore in this repository which tries to avoid this mistake.
- user-files, this contains various sub-directories for simulation files and payloads
  - bodies/, contains payload files being sent with HTTP requests
  - data/, contains test data files for driving simulations with specific test data
  - simulations/, contains Gatling simulations 
- HAR, this directory contains the raw HAR files that were used to build the Gatling scripts 
  
###Starting a sample test run
A good sample script to use for a simulation run would be [the modularized scenario for testing VZW new activations end to end](user-files/simulations/ModularizedScenario.scala). One can kick this off through the gatling.sh function from a standard Gatling installation using the gatling.sh script.
```
$> cd ~/projects/Gatling-POA
$ [Gatling-POA] > /bin/bash /opt/gatling-2.2.3/bin/gatling.sh -sf ./user-files/simulations -bdf ./user-files/bodies -s End_to_End_Scenario

GATLING_HOME is set to /Users/z001x4c/gatling-2.2.3
Simulation End_to_End_Scenario started...

================================================================================
2017-06-26 15:38:53                                           5s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=6      KO=0     )
> VZW_NA_FULL / LoginToRetail / Login                      (OK=1      KO=0     )
> VZW_NA_FULL / LoginToRetail / Login_1                    (OK=1      KO=0     )
..
....
Reports generated in 0s.
Please open the following file: ~/projects/Gatling-POA/results/end-to-end-scenario-14985xxxxx/index.html
```
