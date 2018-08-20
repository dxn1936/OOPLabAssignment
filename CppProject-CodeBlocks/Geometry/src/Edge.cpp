#include "Edge.h"

Edge::Edge() {
    this->xCoordinate = 0;
    this->yCoordinate = 0;
    this->length = 0;
}

Edge::Edge(double length) {
    this->xCoordinate = 0;
    this->yCoordinate = 0;
    this->length = length;
}

Edge::Edge(double xCoordinate, double yCoordinates) {
    this->xCoordinate = xCoordinate;
    this->yCoordinate = yCoordinate;
    this->length = 0;
}

Edge::Edge(double xCoordinate, double yCoordinate, double length) {
    this->xCoordinate = xCoordinate;
    this->yCoordinate = yCoordinate;
    this->length = length;
}

Edge::~Edge() {
    this->xCoordinate = NULL;
    this->yCoordinate = NULL;
    this->length = NULL;
}
