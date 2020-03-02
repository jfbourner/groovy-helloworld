def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop.getProperty("server.port")
    println(port)

}

def loadFile() {
        readFile "${env.WORKSPACE}/target/classes/application.properties" {
        def props = new Properties()
        props.load(it)
        return props;
    }

}
