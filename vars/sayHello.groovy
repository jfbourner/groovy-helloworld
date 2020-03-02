def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop.getProperty("server.port")
    println(port)

}

def loadFile() {
    def workspace = env.WORKSPACE
    Properties properties = new Properties()
    def propFileContent = readFile "${workspace}/target/classes/application.properties"
    properties.load(propFileContent)
    return properties;
}
