def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop.getProperty("server.port")
    println(port)

}

def loadFile() {
    path = ${env.WORKSPACE}
    new File("${env.WORKSPACE}/target/classes/application.properties").withReader {
        def props = new Properties()
        props.load(it)
        return props;
    }

}
