(ns window)
(import org.lwjgl.LWJGLException)
(import org.lwjgl.opengl.Display)
(import org.lwjgl.opengl.DisplayMode)

(defn init [WIDTH HEIGHT TITLE]
  (do
    (Display/setDisplayMode (DisplayMode. WIDTH HEIGHT))
    (Display/setTitle TITLE)
    (Display/create)))

(defn renderLoop [q f]
  (while (not (or @q (Display/isCloseRequested)))
    (f)
    (Display/update)
    (Display/sync 60)))

(defn renderThread [close! function]
  (future
    (init 480 320 "Hello Window!")
    (renderLoop close! function)
    (Display/destroy)
    0))
