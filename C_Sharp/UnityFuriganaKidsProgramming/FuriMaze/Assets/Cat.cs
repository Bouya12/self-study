using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Cat : MonoBehaviour {
    void Update() {
        if (Input.GetKey("up") == true) {
            this.transform.position += this.transform.forward * 0.1f;
        } else if (Input.GetKey("down") == true) {
            this.transform.position += this.transform.forward * -0.1f;
        } else if (Input.GetKey("right") == true) {
            this.transform.Rotate(0, 5, 0);
        } else if (Input.GetKey("left") == true) {
            this.transform.Rotate(0, -5, 0);
        }
    }

    private void OnCollisionEnter(Collision collision) {
        if (collision.gameObject.tag == "Dog") {
            this.GetComponent<MeshRenderer>().enabled = false;
        }
    }
}
