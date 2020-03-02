def call(String name = 'human') {
    echo "Hello, ${name}."

    def prop = loadFile();
    def port = prop.getProperty("server.port")
    println(port)

}

def loadFile() {
    def workspace = env.WORKSPACE
    def propFileContent = libraryResource "${workspace}/target/classes/application.properties"
    def props = readProperties text: propFileContent
    return props;
}
