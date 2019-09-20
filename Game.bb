;MY GAME!
;_______________
;GRAPHICS
Graphics3D 1440,900
SetBuffer BackBuffer()
;COLLISION TYPES
camera_type=1
solid_Type=2
camera_radius#=2
;VISUAL
;camera
camera=CreateCamera()
PositionEntity camera,10,5,-10
EntityType camera, camera_type
CameraFogMode camera,1
CameraFogColor camera,20,50,100
CameraFogRange camera,1,55
;light
light=CreateLight()
RotateEntity light,90,0,0
;INCLUDES


;ROOMS
;______________
;ROOM1
gr1=CreateCube()
PositionEntity gr1,0,0,0
ScaleEntity gr1,20,1,20
EntityType gr1, solid_type
;--
gr1texture=LoadTexture("media/wood17.jpg")
ScaleTexture gr1texture,.05,.05
EntityTexture gr1,gr1texture
;---------
w1r1=CreateCube()
PositionEntity w1r1,19,5,0
ScaleEntity w1r1,1,5,20
EntityType w1r1, solid_type
;--
wr1texture=LoadTexture("media/brick-wa.jpg")
ScaleTexture wr1texture,.05,.05
EntityTexture w1r1, wr1texture
;---------
w2r1=CreateCube()
PositionEntity w2r1,0,5,-19
ScaleEntity w2r1,20,5,1
EntityType w2r1, solid_type
;--
EntityTexture w2r1, wr1texture
;---------
w3r1=CreateCube()
PositionEntity w3r1,-19,5,0
ScaleEntity w3r1,1,5,20
EntityType w3r1, solid_type
;--
EntityTexture w3r1, wr1texture
;---------
w4r1=CreateCube()
PositionEntity w4r1,-12,5,20
ScaleEntity w4r1,6,5,1
EntityType w4r1, solid_type
;--
EntityTexture w4r1, wr1texture
;---------
w5r1=CreateCube()
PositionEntity w5r1,12,5,20
ScaleEntity w5r1,6,5,1
EntityType w5r1, solid_type
;--
EntityTexture w5r1, wr1texture
;---------
cr1=CreateCube()
PositionEntity cr1,0,10,0
ScaleEntity cr1,20,.3,20
;--
EntityTexture cr1, wr1texture
;HALLWAY1
gh1=CreateCube()
PositionEntity gh1,0,0,30
ScaleEntity gh1,6,1,10
EntityType gh1, solid_type
;--
gh1texture=LoadTexture("media/tile1.jpg")
ScaleTexture gh1texture,.5,.5
EntityTexture gh1, gh1texture
;---------
w1h1=CreateCube()
PositionEntity w1h1,6,0,30
ScaleEntity w1h1,1,10,10
EntityType w1h1, solid_type
;--
wh1texture=LoadTexture("media/board1.jpg")
ScaleTexture wh1texture,1,.2
EntityTexture w1h1, wh1texture
;---------
w2h1=CreateCube()
PositionEntity w2h1,-6,0,30
ScaleEntity w2h1,1,10,10
EntityType w2h1, solid_type
;--
EntityTexture w2h1, wh1texture

;ROOM2

;SCENERY
;torch
torch=CreateCone(5)
PositionEntity torch,0,5,-18
RotateEntity torch,180,0,0
EntityColor torch,0,0,0


;COLLISIONS
;collisions
Collisions camera_type, solid_type,2,2
;radius
EntityRadius camera, camera_radius#

;PROGRAM START
While Not KeyDown(1)
;gravity/physics
MoveEntity camera,0,-.5,0
;camera
If KeyDown( 205 )=True Then TurnEntity camera,0,-1,0
If KeyDown( 203 )=True Then TurnEntity camera,0,1,0
If KeyDown( 208 )=True Then MoveEntity camera,0,0,-0.4
If KeyDown( 200 )=True Then MoveEntity camera,0,0,0.4
;end
UpdateWorld
RenderWorld 
Flip

Wend
End
