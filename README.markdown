## appengine-stub

appengine-stub is an ant script to setup and build a compojure hello,
world application for Google's Application Engine.


### Setup

Either clone the repo or download it, then you need to set the following
properties,

 - app-id - Your application ID
 - app-display-name - You applications display name.

Running the setup task will download Google SDK and compojure files, and
unzip them in to their respective folders.

After setup you have working compojure application that prints Hello,
World. You can check it by running the devserver task.

When you first deploy you need to run,
 
    ./sdk/bin/appcfg.sh 

and setup your credentials.

### Tasks

 - devserver - Runs the server for local testing.
 - deploy - Deploys your application to google.
