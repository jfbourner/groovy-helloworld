def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop['server.port']
    println(port)

}

def loadFile() {
    def props = readProperties file: 'target/classes/application.properties'
    properties.load(propFileContent)
    return properties;
}
