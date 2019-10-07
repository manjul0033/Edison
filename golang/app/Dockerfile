# Build
FROM golang:latest AS build
WORKDIR /go/src/edison
RUN go get -d -v golang.org/x/net/html  
COPY app.go .
RUN CGO_ENABLED=0 GOOS=linux go build -a -installsuffix cgo -o app .

# Final Image
FROM alpine:latest  
RUN apk --no-cache add ca-certificates
WORKDIR /root/
COPY --from=build /go/src/edison/app .
CMD ["./app"]
