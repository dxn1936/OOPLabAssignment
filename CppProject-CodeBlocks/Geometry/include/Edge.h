#ifndef EDGE_H
#define EDGE_H

#include <stddef.h>

class Edge
{
    private:
        double xCoordinate, yCoordinate, length;

    public:
        Edge();
        Edge(double length);
        Edge(double xCoordinate, double yCoordinate);
        Edge(double xCoordinate, double yCoordinate, double length);
        virtual ~Edge();

    public:
        double getXCoordinate() { return this->xCoordinate; }
        double getYCoordinate() { return this->yCoordinate; }
        double getLength() { return this->length; }
        void setXCoordinate() { this->xCoordinate = xCoordinate; }
        void setYCoordinate() { this->yCoordinate = yCoordinate; }
        void setLength() { this->length = length; }
};

#endif // EDGE_H
