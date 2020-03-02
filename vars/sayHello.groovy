def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop.getProperty("server.port")
    println(port)

}

def loadFile() {
    def propFileContent = libraryResource './target/classes/application.properties'
    def props = readProperties text: propFileContent
    return props;
}
