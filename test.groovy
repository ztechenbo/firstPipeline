
def start(){
 run_in_node()
}

run_in_node(){
  node {
 state("hello"){
    echo "hello world"
  }
  }
}
