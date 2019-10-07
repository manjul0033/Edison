package main

import (
	"fmt"
	"log"
	"net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w , "<h1>Hello to Edison Health Link !!!</h1>")
}

func main() {
	http.HandleFunc("/" , handler)
	log.Fatal(http.ListenAndServe(":9999", nil))
}
