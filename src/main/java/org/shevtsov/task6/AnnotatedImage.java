package org.shevtsov.task6;


public class AnnotatedImage {
    private final String imagePath;
    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    public Annotation findByPoint(int x, int y) {
        for (Annotation annotation : annotations) {
            Figure figure = annotation.getFigure();
            if (figure instanceof Rectangle rectangle) {
                if (x >= rectangle.getX() && x <= rectangle.getX() + rectangle.getWidth()
                        && y >= rectangle.getY() && y <= rectangle.getY() + rectangle.getHeight()) {
                    return annotation;
                }
            } else if (figure instanceof Circle circle) {
                int dx = x - circle.getX();
                int dy = y - circle.getY();
                if (Math.sqrt(dx * dx + dy * dy) <= circle.getRadius()) {
                    return annotation;
                }
            }
        }
        return null;
    }

    public Annotation findByLabel(String label) {
        for (Annotation annotation : annotations) {
            if (annotation.getLabel().contains(label)) {
                return annotation;
            }
        }
        return null;
    }
}

